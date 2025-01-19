import pandas as pd

data = {
    'Usernames': ['admin', 'Monica', 'Ricjard'],
    'Passwords': ['password', 'Arise', 'Build']
}

df = pd.DataFrame(data)

df.to_csv('user_data.csv', index=False)

print('Data written to user_data.csv successfully.')