/**
 * This program calculates 
 *
 * By: Evan Beaudoin
 * Version: 1.0
 * Since:   2024-02-16
 */

import { createPrompt } from 'bun-promptx'

// variables
let cookTimes = {
  "pizza": 45,
  "soup": 105,
  "sub": 60
}

// input
var itemString = createPrompt("Enter the food you want to heat: ")
var amountString = createPrompt("Enter the quantity of food you want to heat (max 3): ")

var item = itemString.value?.toLowerCase() ?? ""
var amount = parseInt(amountString.value || "-1")


// process and error handling
if (item in cookTimes && (amount > 0 && amount <= 3 )) {
  var increaseMulitplier = 1

  if (amount == 2) {
    increaseMulitplier = 1.5
  }
  else if (amount == 3) {
    increaseMulitplier = 2
  }
  var cookTime = cookTimes[item] * increaseMulitplier
  var minutes = Math.floor(cookTime / 60)
  var seconds = cookTime % 60

  console.log("\nCook time is " + minutes + " minutes and " + seconds + " seconds.")
}
else {
  console.log("\nInvalid Input")
}


console.log("\nDone.")


