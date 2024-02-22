/**
* This program calculates energy using 
* Einstein's equation
* By:Evan Beaudoin
* Version: 1.0
* Since:   2024-02-16
 */

import { createPrompt } from 'bun-promptx'

// variables
const speedOfLight = 299792458;
 
// input
const massString = createPrompt("Enter the mass of an object (kg): ")
 
// error checking
const mass = parseFloat(massString.value || "-1")
if (isNaN(mass) == true || mass < 0) {
  console.log("Invalid input.")
} else {
  // process
  const energy = mass * Math.pow(speedOfLight, 2)
  // output
  console.log(`${mass} kg would produce ${energy.toExponential(6)} J of energy.`)
}
 
console.log("\nDone.")
 
            
