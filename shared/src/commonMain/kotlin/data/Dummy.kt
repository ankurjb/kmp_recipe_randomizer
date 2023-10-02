package data

import model.MealTime

val breakfast = listOf(
    lemonRice,
    zeroOilPoha
)

val lunch = listOf(
    alooTamatarSabzi
)

val dinner = listOf(
    dalWithSpinach,
    moongDalKhichdi
)

val allMeals = listOf(
    MealTime.Breakfast(breakfast),
    MealTime.Lunch(lunch),
    MealTime.Dinner(dinner)
)
