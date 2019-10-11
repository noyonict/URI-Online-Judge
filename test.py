import calendar

for month_idx in range(1, 13):
    print(calendar.month_name[month_idx])
    print(calendar.month_abbr[month_idx])
    print("")


import datetime

mydate = datetime.datetime.now()
print(str(mydate.strftime("%B")).lower())  # 'December'
print(str(mydate.strftime("%b")).lower())  # 'dec'

