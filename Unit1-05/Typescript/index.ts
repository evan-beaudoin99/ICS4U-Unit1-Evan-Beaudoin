/**
 * This program calculates what the 
 * board foot is.
 *
 * By: Evan Beaudoin
 * Version: 2.0
 * Since:   2024-03-04
 */

import { createPrompt } from 'bun-promptx'

function boardFoot(width, height) {
  // The boardFoot() calculates what the board foot is.
  const length = 144 / (width * height)
        
  return length
}

// Input
let widthString = createPrompt("Enter the width (inches): ")
let heightString = createPrompt("Enter the length (inches): ") 

let width = parseFloat(widthString.value || "-1")
let height = parseFloat(heightString.value || "-1")

if (width < 0 || isNaN(width) || height < 0 || isNaN(height)) {
  console.log("Invalid input")
}
else {
  // Process
  const length = boardFoot(width, height)

  // Output
  console.log(`The length needed for exactly 1 board foot is: ${length} inches`)
}

console.log("\nDone.")
