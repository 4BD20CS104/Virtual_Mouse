#! python3
# pw.py - An insecure password locker program
PASSWORDS = {'email':'F7min1BDDuvMJuxESSKHFhTxFtjVB6',
             'blog':'VmALvQyKAxiVH5G8vo1if1MLZF3sdt',
             'luggage':'1234'}
import sys,pyperclip
if len(sys.argv)<2:
    print('Usage: py pw.py [account] - copy account password')
    sys.exit()
account = sys.argv[1]
if account in PASSWORDS:
    pyperclip.copy(PASSWORDS[account])
    print('Password for'+account+'copied to clipboard.')
else:
    print('There is no account named'+account)