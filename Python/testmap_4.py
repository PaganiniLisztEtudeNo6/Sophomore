import matplotlib.pyplot as plt
import numpy as np
#print(plt.style.available) 

plt.style.use('seaborn')
y = np.random.random(1,11,5)
x = list('abcde')

plt.plot(x,y)
plt.show()