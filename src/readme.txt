Overview:
Despite our best instructions and guidance in the user interface, any situation involving user input values can sometimes cause unexpected outcomes to occur in your code.  Now that you know about exceptions and try/catch, you can start defensive programming – taking care to guard against error situations that could cause your program to crash.

Your application in the last project was a huge success, and the financial department is much more efficient now. They’ve asked you to expand the profit and loss calculations to include calculating the profit margin. This will help them identify which products or services are making the company the most money.

The formula for calculating the profit margin is:

Profit margin = (selling price – cost) / cost

Details:
Modify your code from assignment 4 to add calculations and output for profit margin. Use try / catch to help defend your program from unexpected / non-computable runtime situations. Generally, these exceptions will be a result of invalid user input. If your program doesn’t catch these exceptions, it could crash, leaving the user unhappy and unsure what to do next. You’ll need to make your program more robust, so it can handle exceptions gracefully, and provide useful information to the user about how to correct the issue and continue.
Your user could enter a string instead of an integer for number of items sold, and you’ll need to catch that exception. When calculating profit margin, you’ll need to use try/catch around your new calculations to guard against division by zero.

Review your code for other situations you may need to defend against. Some situations that could cause unexpected runtime situations include casting objects from one type to another, situations where a variable might unexpectedly become null, and situations where user input is accepted and processed. Be sure to include at least two exceptions that you handle programmatically.