import pandas as pd

df = pd.read_csv('user_data.csv')

print("Usernames column values:")
print(df['Usernames'].values)

print("\nUsername and password of the second row:")
print(f"Username: {df.loc[1, 'Usernames']}, Password: {df.loc[1, 'Passwords']}")

sorted_usernames_df = df.sort_values('Usernames')
print("\nData sorted by Usernames in ascending order:")
print(sorted_usernames_df)

sorted_passwords_df = df.sort_values('Passwords', ascending=False)
print("\nData sorted by Passwords in descending order:")
print(sorted_passwords_df)