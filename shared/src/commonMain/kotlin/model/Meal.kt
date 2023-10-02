package model

sealed class MealTime(val name: String) {
    data class Breakfast(
        val recipes: List<Recipe>
    ) : MealTime("Breakfast")

    data class Lunch(
        val recipes: List<Recipe>
    ) : MealTime("Lunch")

    data class Dinner(
        val recipes: List<Recipe>
    ) : MealTime("Dinner")
}

data class Meal(
    val name: String,
    val recipes: List<Recipe>
)

data class Recipe(
    val recipeImage: String,
    val recipeName: String,
    val ingredients: List<Ingredients>,
    val dayOfTheWeek: Int,
    val cookingTime: CookingTime
) {
    data class Ingredients(
        val stepCount: String? = null,
        val name: String,
        val ingredientImage: String,
        val quantity: String,
        val instruction: String? = null
    )

    data class CookingTime(
        val preparationTime: Byte,
        val cookingTime: Byte
    ) {
        val totalCookingTime: Int
            get() = preparationTime + cookingTime
    }
}
