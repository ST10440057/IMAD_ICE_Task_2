# IMAD Ice task 2

## Description
MainActivity (Screen 1)
Purpose:

Displays the accumulated income and expenses along with the current balance.
Navigates to Income or Expense activity screens upon button clicks.

Components:

TextViews:

tvIncome: Displays the total income.
tvExpenses: Displays the total expenses.
tvBalance: Displays the current balance, with color indicating positive (green) or negative (red).
Buttons:

btnIncome: Navigates to the IncomeActivity.
btnExpenses: Navigates to the ExpenseActivity.
Functions:

onCreate(): Initializes the activity, sets up the layout, updates the balance, and sets click listeners for buttons.
updateBalance(): Calculates the balance from the total income and expenses, updates the TextViews, and sets the balance color.
IncomeActivity (Screen 2)
Purpose:

Allows users to enter multiple income sources.
Displays the current total income.
Shows a list of previous income entries.
Components:

EditTexts:

etIncomeDescription: Input for income description.
etIncomeAmount: Input for income amount.
Button:

btnAddIncome: Adds the entered income to the list and updates the total income.
TextView:

tvTotalIncome: Displays the total income.
ListView:

lvIncome: Displays a list of income entries.
Functions:

onCreate(): Initializes the activity, sets up the layout, updates the total income, and sets click listeners for the add button.
updateTotalIncome(): Updates the displayed total income.
updateIncomeList(): Updates the ListView with the current income entries.
ExpenseActivity (Screen 3)
Purpose:

Allows users to enter expenses.
Displays the current total expenses.
Shows a list of previous expense entries.
Components:

EditTexts:

etExpenseDescription: Input for expense description.
etExpenseCategory: Input for expense category.
etExpenseAmount: Input for expense amount.
Button:

btnAddExpense: Adds the entered expense to the list and updates the total expenses.
TextView:

tvTotalExpenses: Displays the total expenses.
ListView:

lvExpenses: Displays a list of expense entries.
Functions:

onCreate(): Initializes the activity, sets up the layout, updates the total expenses, and sets click listeners for the add button.
updateTotalExpenses(): Updates the displayed total expenses.
updateExpenseList(): Updates the ListView with the current expense entries.
Layout Files
activity_main.xml
Defines the layout for MainActivity, including TextViews for displaying income, expenses, and balance, and buttons for navigation.

activity_income.xml
Defines the layout for IncomeActivity, including EditTexts for input, a button for adding income, a TextView for total income, and a ListView for displaying income entries.

activity_expense.xml
Defines the layout for ExpenseActivity, including EditTexts for input, a button for adding expenses, a TextView for total expenses, and a ListView for displaying expense entries.

# Summary
This Android application allows users to track their income and expenses, providing real-time updates on their financial status. Users can navigate between the main screen, income entry screen, and expense entry screen, with all input validated and displayed accordingly. The application uses in-memory storage for simplicity, but this can be extended to use persistent storage like a database for real-world use.

# screenshots
# blank expenses screen
![image](https://github.com/ST10440057/IMAD_ICE_Task_2/assets/161335502/e5a62fde-5b95-4e3e-9e49-bcfb7e0d27db)
# blank main screen
![image](https://github.com/ST10440057/IMAD_ICE_Task_2/assets/161335502/73f1a41c-fa1c-4008-99d0-5e021b3e39bb)
# blank Income screen
![image](https://github.com/ST10440057/IMAD_ICE_Task_2/assets/161335502/04856f69-e2f5-477a-95ba-ef6003f8f5da)




