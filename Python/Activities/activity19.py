# Import pandas
import pandas
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Richard", "victor", "Peter"],
	'LastName':["Prabhakar", "Rubdi", "George"],
	'Email':["Ricp@example.com", "vicr@example.com", "peterg@example.com"],
	'PhoneNumber':["4167890987", "416123431", "4160191817"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.close()