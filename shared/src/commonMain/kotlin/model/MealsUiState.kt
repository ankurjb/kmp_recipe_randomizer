package model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import data.allMeals

class MealsViewModelState {
    var time: String by mutableStateOf("Today, May 22")
    var meals: List<MealTime> by mutableStateOf(allMeals)
    var selectedRecipe: Recipe? by mutableStateOf(null)
}

@Composable
fun mealsUiState() = remember {
    mutableStateOf(MealsViewModelState())
}
