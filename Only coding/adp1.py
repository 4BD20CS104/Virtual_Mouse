#!python3
PASSWORDS = {'email':'syedrihan223@gmail.com',
             'blog':'Syed','luggage':'1234'}
import sys,pyperclip
if len(sys.argv)<3:
    print('Usage: py pw.py [account] - copy account password')
    sys.exit()
account = sys.argv[1]
if account in PASSWORDS:
    pyperclip.copy(PASSWORDS[account])
    print('Password for'+account+'copied to clipboard.')
else:
    print('There is no account named'+account)