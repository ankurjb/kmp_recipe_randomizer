package data

import model.Recipe

val lemonRice = Recipe(
    recipeImage = "https://res.cloudinary.com/dgakjrw8j/image/upload/w_250,c_fill/v1670851735/Lemon%20Rice/lemon_rice_front_r41wg2.webp",
    recipeName = "Lemon Rice",
    ingredients = listOf(
        mustardOil(
            quantity = "1.5 Large Spoon",
            stepCount = "Adding Ingredients"
        ),
        mustardSeeds("1 Small Spoon"),
        hing("0.5 Small Spoon"),
        driedRedChilli("1"),
        haldi("0.5 Small Spoon"),
        adrak("5 gm"),
        chawal("80 gm", "Adding Ingredients"),
        salt("1 Medium Spoon"),
        dhaniya("2 Stems", "Garnish"),
        peanut("15 gm", instruction = "Roasted & Salted"),
        lemonJuice("0.75 Large Spoon")
    ),
    dayOfTheWeek = 0,
    cookingTime = Recipe.CookingTime(0, 28)
)

val zeroOilPoha = Recipe(
    recipeImage = "https://res.cloudinary.com/dgakjrw8j/image/upload/w_250,c_fill/v1676713603/Poha/IMG_4849_1_hnhc97.webp",
    recipeName = "Zero Oil Poha",
    ingredients = listOf(
        poha("60 gm", "Soaking Poha then adding to bowl"),
        salt("1 Small Spoon"),
        mirchi("1", "Add Ingredient"),
        pyaaz("30 gm"),
        jeera("1 Small Spoon"),
        mustardOil(quantity = "0.5 Large Spoon"),
        peanut(quantity = "10 gm", instruction = "raw"),
        aloo("40 gm", "Adding Vegetables"),
        haldi("0.75 Small Spoon", "Adding Ingredients"),
        salt("0.25 Small Spoon"),
        matar("30 gm"),
        lemonJuice("0.25 Large Spoon", "Garnish"),
        dhaniya("2 stem"),
        peanut("20 gm", instruction = "Roasted & Salted Peanuts")
    ),
    dayOfTheWeek = 0,
    cookingTime = Recipe.CookingTime(0, 28)
)

val alooTamatarSabzi = Recipe(
    recipeImage = "https://res.cloudinary.com/dgakjrw8j/image/upload/w_250,c_fill/v1666086334/Aloo%20Tamatar%20Sabzi/Aloo_Tamatar_front_fo3avh.webp",
    recipeName = "Aloo Tamatar Sabzi",
    ingredients = listOf(
        mustardOil(
            quantity = "1 Large Spoon",
            stepCount = "Adding Ingredients"
        ),
        jeera("0.5 Small Spoon"),
        hing("0.5 Small Spoon"),
        dhaniya("2 Stems", "Adding Vegetables & Adding Spices"),
        mirchi("1"),
        lehsun("4 cloves"),
        tomato("120 gm"),
        kashmiriMirch("1 Small Spoon"),
        haldi("0.5 Small Spoon"),
        salt("1 Small Spoon"),
        kasooriMethi("2 Medium Spoon"),
        aloo("120 gm", "Adding Ingredients"),
        kasooriMethi("1 Large Spoon", "Garnish")
    ),
    dayOfTheWeek = 0,
    cookingTime = Recipe.CookingTime(0, 46)
)

val dalWithSpinach = Recipe(
    recipeImage = "https://res.cloudinary.com/dgakjrw8j/image/upload/w_250,c_fill/v1666086334/Aloo%20Tamatar%20Sabzi/Aloo_Tamatar_front_fo3avh.webp",
    recipeName = "Dal with Spinach",
    ingredients = listOf(
        moonDal(
            "40 gm",
            "Washing Soaking Dal"
        ),
        mustardOil(
            quantity = "1.5 Large Spoon",
            stepCount = "Adding Ingredients"
        ),
        jeera("1 Small Spoon"),
        hing("0.25 Small Spoon"),
        adrak(
            quantity = "2 gm",
            stepCount = "Adding Ingredients"
        ),
        lehsun("3 cloves"),
        mirchi("1"),
        palak("25 gm", "Adding Ingredients"),
        haldi("0.25 Small Spoon"),
        salt("0.5 Small Spoon"),
        dhaniya("3 Stems", "Garnish")
    ),
    dayOfTheWeek = 0,
    cookingTime = Recipe.CookingTime(0, 46)
)

val moongDalKhichdi = Recipe(
    recipeImage = "https://res.cloudinary.com/dgakjrw8j/image/upload/w_250,c_fill/v1666086334/Aloo%20Tamatar%20Sabzi/Aloo_Tamatar_front_fo3avh.webp",
    recipeName = "Moong Dal Khichdi",
    ingredients = listOf(
        mustardOil(
            quantity = "1 Large Spoon",
            stepCount = "Adding Ingredients"
        ),
        jeera("1 Small Spoon"),
        hing("0.25 Small Spoon"),
        adrak(
            quantity = "2 gm",
            stepCount = "Adding Ingredients"
        ),
        lehsun("3 cloves"),
        mirchi("1"),
        palak("25 gm", "Adding Ingredients"),
        haldi("0.25 Small Spoon"),
        salt("0.5 Small Spoon"),
        dhaniya("3 Stems", "Garnish")
    ),
    dayOfTheWeek = 0,
    cookingTime = Recipe.CookingTime(0, 46)
)
