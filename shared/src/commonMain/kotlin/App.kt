import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import kotlinx.coroutines.CoroutineScope
import model.MealTime
import model.MealsViewModelState
import model.Recipe
import model.mealsUiState
import utils.HorizontalSpacer
import utils.VerticalSpacer
import utils.showBottomSheet

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun App(
    scope: CoroutineScope = rememberCoroutineScope()
) {
    val uiState by mealsUiState()
    MaterialTheme {
        val scaffoldState = rememberBottomSheetScaffoldState()
        BottomSheetScaffold(
            scaffoldState = scaffoldState,
            sheetContent = {
                uiState.selectedRecipe?.let {
                    RecipeDetailsScreen(it)
                }
            },
            sheetPeekHeight = 0.dp
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = uiState.time,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )

                MealScreen(uiState) {
                    uiState.selectedRecipe = it
                    println("Tagger 2 ${uiState.selectedRecipe?.recipeName}")
                    scaffoldState.showBottomSheet(scope)
                }
            }
        }
    }
}

@Composable
fun MealScreen(
    uiState: MealsViewModelState,
    onRecipeClick: (Recipe) -> Unit
) = LazyColumn(
    modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
) {
    val meals = uiState.meals
    items(meals) { mealTime ->
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = mealTime.name,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Normal
                )
            )

            Icon(Icons.Filled.Refresh, "")
        }

        VerticalSpacer(12.dp)
        LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            when (mealTime) {
                is MealTime.Breakfast -> {
                    items(mealTime.recipes) { recipe ->
                        RecipeMenu(recipe) {
                            onRecipeClick(recipe)
                        }
                    }
                }

                is MealTime.Lunch -> {
                    items(mealTime.recipes) { recipe ->
                        RecipeMenu(recipe) {
                            onRecipeClick(recipe)
                        }
                    }
                }

                is MealTime.Dinner -> {
                    items(mealTime.recipes) { recipe ->
                        RecipeMenu(recipe) {
                            onRecipeClick(recipe)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RecipeMenu(
    recipe: Recipe,
    onRecipeClick: () -> Unit
) = Column {
    Box {
        KamelImage(
            modifier = Modifier
                .size(150.dp)
                .background(shape = RoundedCornerShape(16.dp), color = Color.White)
                .clip(shape = RoundedCornerShape(16.dp))
                .clickable(onClick = onRecipeClick),
            resource = asyncPainterResource(recipe.recipeImage),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(8.dp)
                .background(Color.White, shape = RoundedCornerShape(4.dp))
                .padding(horizontal = 4.dp),
            text = "~ ${recipe.cookingTime.totalCookingTime} min",
            style = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        )
    }

    VerticalSpacer(8.dp)

    Text(
        text = recipe.recipeName,
        style = TextStyle(
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        )
    )

    VerticalSpacer(16.dp)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RecipeDetailsScreen(
    recipe: Recipe
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        stickyHeader {
            Text(
                modifier = Modifier.fillMaxWidth().background(Color.White),
                text = recipe.recipeName,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        item {
            Box {
                KamelImage(
                    modifier = Modifier
                        .aspectRatio(16f / 8f)
                        .background(shape = RoundedCornerShape(16.dp), color = Color.White)
                        .clip(shape = RoundedCornerShape(16.dp)),
                    resource = asyncPainterResource(recipe.recipeImage),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )

                /*Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .align(Alignment.BottomStart)
                ) {
                    Text("Recipe")
                }*/
            }
        }

        items(recipe.ingredients) { ingredient ->
            IngredientView(ingredient)
        }
    }
}

@Composable
fun IngredientView(
    ingredient: Recipe.Ingredients
) = Column(
    modifier = Modifier.fillMaxWidth()
) {
    ingredient.stepCount?.let {
        Text(
            text = "Step: $it",
            style = TextStyle(
                fontWeight = FontWeight.Bold
            )
        )
        VerticalSpacer(4.dp)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        KamelImage(
            modifier = Modifier
                .size(50.dp)
                .background(shape = RoundedCornerShape(16.dp), color = Color.White)
                .clip(shape = RoundedCornerShape(16.dp)),
            resource = asyncPainterResource(ingredient.ingredientImage),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        HorizontalSpacer(8.dp)

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(ingredient.name, style = TextStyle(color = Color.Black))
            Text(ingredient.quantity, style = TextStyle(color = Color.Black))
        }
    }
    VerticalSpacer(height = 4.dp)
}

expect fun getPlatformName(): String
