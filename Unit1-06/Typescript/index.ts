
import * as fs from 'fs'

function meanCalculator(intArray: number[]) {
  let sum = 0
  
  for (let index = 0; index < intArray.length; index++) {
      sum += intArray[index] 
  }
  const mean = sum / intArray.length
  return mean
}
/*
function medianCalculator(intArray: number[]) {
  const medianArray: number[] = []
  let minIndex = 0
  let minValue = intArray[0]

  while (intArray.length > 0) {
      for (let i = 1; i < intArray.length; i++) {
          if (intArray[i] < minValue) {
              minIndex = i
              minValue = intArray[i]
          }
      }
      medianArray.push(minValue)
      intArray.splice(minIndex, 1)
  }

  return medianArray
}
*/


const file = fs.readFileSync('../set1.txt', 'utf-8')

const stringArray = file.split(/\r?\n/)
const intArray: number[] = stringArray.map(str => parseInt(str, 10));

const mean = meanCalculator(intArray)
//const median = medianCalculator(intArray)

console.log(mean)
//console.log(median)
