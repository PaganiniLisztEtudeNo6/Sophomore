from matplotlib import pyplot as plt
import pandas as pd
import matplotlib as mpl
import csv

plt.rcParams['font.family'] = 'tahoma'

df = pd.read_csv('filename.csv')

by_zone = df.groupby('month_number')
by_zone.sum()[['1','2','3','......']].plot.bar()
