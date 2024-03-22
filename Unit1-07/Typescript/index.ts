/**
*
* This program generates student's marks
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-03-22
*/

import { writeFileSync } from "fs"

function generateGaussian(mean, std){
  // https://discourse.psychopy.org/t/javascript-gaussian-function/17724/2
  var _2PI = Math.PI * 2;
  var u1 = Math.random();
  var u2 = Math.random();
  
  var z0 = Math.sqrt(-2.0 * Math.log(u1)) * Math.cos(_2PI * u2);
  var z1 = Math.sqrt(-2.0 * Math.log(u1)) * Math.sin(_2PI * u2);

  return z0 * std + mean;
}

// Add first row
let array = 'Name,'
for (let counter = 1; counter < 9; counter ++) {
  array = array + ('Assignment' + counter) + ','
}
array = array + "\n"

// Generate marks
let sum = 0
let listCount = 0
let studentCount = 1
for (var counter = 0; counter < 24; counter++) {
  const normalNumber = generateGaussian(75, 10)
  sum = sum + normalNumber
  if (listCount == 0) {
    array = array + ('Student' + studentCount) + ','
    studentCount++
  }
  array = array + Math.floor(normalNumber) + ','
  if (listCount == 7) {
    array = array + '\n'
    listCount = 0
  } else {
    listCount++
  }
}

// Calculate average
let average = sum / counter

console.log("\nMark Average: " + average.toFixed(2) + "\n")
console.log(array)
writeFileSync("Marks.csv", array)

console.log("\nDone.")
