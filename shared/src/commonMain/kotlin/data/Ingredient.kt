package data

import model.Recipe

fun mustardOil(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Mustard Oil",
    ingredientImage = "data:image/jpeg;base64,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",
    quantity = quantity
)

fun mustardSeeds(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Mustard Seeds",
    ingredientImage = "https://nuttyyogi.com/cdn/shop/products/MustardSeeds.png?v=1680767117",
    quantity = quantity
)

fun jeera(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Jeera",
    ingredientImage = "https://familyneeds.co.in/cdn/shop/products/jeera_600x600.jpg?v=1619887516",
    quantity = quantity
)

fun hing(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Hing",
    ingredientImage = "https://www.srisritattva.com/cdn/shop/products/Hing10g.jpg?v=1665033441",
    quantity = quantity
)

fun dhaniya(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Dhaniya",
    ingredientImage = "https://familyneeds.co.in/cdn/shop/products/dhuniya_600x600.jpg?v=1620573441",
    quantity = quantity,
    instruction = "Remove roots, wash"
)

fun mirchi(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Mirchi",
    ingredientImage = "https://kumaribasket.com/wp-content/uploads/2020/07/Green-chilli-02-1200x675.jpg",
    quantity = quantity,
    instruction = "Remove stem"
)

fun adrak(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Adrak",
    ingredientImage = "https://www.stylecraze.com/wp-content/uploads/2019/04/Ginger-Adrak-Benefits.jpg",
    quantity = quantity,
    instruction = "peeled and washed"
)

fun lehsun(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Lehsun",
    ingredientImage = "https://img2.exportersindia.com/product_images/bc-full/2021/11/3783216/fresh-garlic-1636525038-6062387.png",
    quantity = quantity,
    instruction = "peeled"
)

fun tomato(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Tomato",
    ingredientImage = "https://img.etimg.com/thumb/width-640,height-480,imgsize-56196,resizemode-75,msid-95423731/magazines/panache/5-reasons-why-tomatoes-should-be-your-favourite-fruit-this-year/tomatoes-canva.jpg",
    quantity = quantity,
    instruction = "Cut in 2"
)

fun kashmiriMirch(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Kashmiri Mirch",
    ingredientImage = "https://m.media-amazon.com/images/I/71LF6EZbWYL.jpg",
    quantity = quantity
)

fun haldi(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Haldi",
    ingredientImage = "https://elthecook.co.in/cdn/shop/products/haldi-powder.jpg?v=1602868426",
    quantity = quantity
)

fun salt(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Salt",
    ingredientImage = "https://static.toiimg.com/photo/72144360.cms",
    quantity = quantity
)

fun kasooriMethi(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Kasoori Methi",
    ingredientImage = "https://www.rambandhu.com/wp-content/uploads/2017/11/01-5.jpg",
    quantity = quantity
)

fun aloo(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Aloo",
    ingredientImage = "https://m.media-amazon.com/images/I/313dtY-LOEL._AC_UF1000,1000_QL80_.jpg",
    quantity = quantity,
    instruction = "Cut in cubes"
)

fun driedRedChilli(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Dried Red Chilli",
    ingredientImage = "https://m.media-amazon.com/images/I/51-N0wzSxIS.jpg",
    quantity = quantity,
    instruction = "Remove top stem"
)

fun chawal(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Chawal",
    ingredientImage = "https://www.vegrecipesofindia.com/wp-content/uploads/2022/06/how-to-cook-basmati-rice-2.jpg",
    quantity = quantity
)

fun peanut(
    quantity: String,
    stepCount: String? = null,
    instruction: String
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Peanut",
    ingredientImage = "https://bakeitwithlove.com/wp-content/uploads/2022/09/peanut-substitute-sq.jpg",
    quantity = quantity,
    instruction = instruction
)

fun lemonJuice(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Lemon Juice",
    ingredientImage = "https://upload.wikimedia.org/wikipedia/commons/f/f7/Lemon_-_whole_and_split.jpg",
    quantity = quantity
)

fun poha(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Poha",
    ingredientImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Poha.jpg/800px-Poha.jpg",
    quantity = quantity,
    instruction = "Medium or Thick Poha"
)

fun pyaaz(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Pyaaz",
    ingredientImage = "https://cpimg.tistatic.com/08064502/b/4/red-onion.jpg",
    quantity = quantity,
    instruction = "Peeled, cut in 4"
)

fun matar(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Matar",
    ingredientImage = "https://media.healthyfood.com/wp-content/uploads/2017/03/In_season_November_Peas.jpg",
    quantity = quantity
)

fun moonDal(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Moong Dal Split",
    ingredientImage = "",
    quantity = quantity
)

fun palak(
    quantity: String,
    stepCount: String? = null,
) = Recipe.Ingredients(
    stepCount = stepCount,
    name = "Palak",
    ingredientImage = "https://www.bigbasket.com/media/uploads/p/xl/40198829_1-fresho-baby-spinach-hydroponically-grown.jpg",
    quantity = quantity
)
/**
(
quantity: String,
stepCount: String? = null,
) = Recipe.Ingredients(
stepCount = stepCount,
name = "",
ingredientImage = "",
quantity = quantity
)

 */
