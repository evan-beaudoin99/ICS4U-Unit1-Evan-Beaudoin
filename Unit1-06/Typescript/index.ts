/*

* This program checks the mean, median, and mode of a list of integers in a text file
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-03-17
*/

import { createPrompt } from 'bun-promptx'
import { readFileSync } from 'fs'

// Finds the mean of an array of numbers
function findMean(list) {
  let sumOfNumbers = 0
  for (let counter = 0; counter < list.length; counter++) {
    sumOfNumbers = sumOfNumbers + list[counter]
  }
  const mean = sumOfNumbers / list.length
  return mean
}

// Finds the median of an array of numbers
function findMedian(list) {
  list.sort(function(a, b){return a - b})
  const halfLength = list.length / 2
  const remainder = halfLength % 1
  let median = 0
  if (remainder != 0) {
    median = list[halfLength - 0.5]
  } else {
    median = (list[halfLength - 1] + list[halfLength]) / 2
  }
  return median
}

// Finds the mode of an array of numbers
function findMode(list) {
  let modeMap = {}
  let maxCount = 0
  let modes = []

  list.forEach(num => {
    modeMap[num] = (modeMap[num] || 0) + 1
    if (modeMap[num] > maxCount) {
      maxCount = modeMap[num]
      modes = [num]
    } else if (modeMap[num] === maxCount) {
      modes.push(num)
    }
  })

  return modes
}

// Get array of numbers
let array = readFileSync(process.argv[2], 'utf8').toString().split("\n")
array = array.map((str) => parseInt(str, 10)) // Convert string to int

// Error check
let errorPassed = true
for (let counter = 0; counter < array.length; counter++) {
  if (isNaN(array[counter]) == true) {
    console.log('Array contains a NaN value.')
    errorPassed = false
    break
  }
}

if (errorPassed == true) {
  // Find mean, median, and mode
  console.log(`Current array: ${array}\n`)
  const mean = findMean(array)
  const median = findMedian(array)
  const mode = findMode(array)
  console.log(`The mean is ${mean}`)
  console.log(`The median is ${median}`)
  console.log(`The mode is ${mode}`)
}

// Show the program as done
console.log('\nDone.')
