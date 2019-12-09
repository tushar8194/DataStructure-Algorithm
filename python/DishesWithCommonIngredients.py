
# Question : https://www.careercup.com/question?id=5754648968298496

dishes = {"Pasta":["Tomato Sauce", "Onions", "Garlic"],
          "Chicken Curry":["Chicken", "Curry Sauce"],
          "Fried Rice":["Rice", "Onions", "Nuts"],
          "Salad":["Spinach", "Nuts"],
          "Sandwich":["Cheese", "Bread"],
          "Quesadilla":["Chicken", "Cheese"]}


def groupByIngredients(dishes):
    ingredients = {}
    for dish in dishes:
        for ingredient in dishes[dish]:
            if ingredient in ingredients:
                ingredients[ingredient].append(dish)
            else:
                ingredients[ingredient] = [dish]

    return ingredients


print(groupByIngredients(dishes))

# Output: ("Pasta", "Fried Rice") ("Fried Rice, "Salad") , ("Chicken Curry", "Quesadilla") ("Sandwich", "Quesadilla")