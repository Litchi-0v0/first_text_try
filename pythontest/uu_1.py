#pip install nunpy
# import numpy as np
# a = np.diag((1,2,3))生成对角阵
# a = np.zeros((2,2,2))生成0矩阵
# a = np.array(([2,3,4],[5,6,,7]))生成矩阵
# import numpy.linalg as nplg 线性运算

import numpy as np
import matplotlib.pyplot as plt

t = np.linspace(0, 2*np.pi, 1000)
x = 16 * np.sin(t)**3
y = 13 * np.cos(t) - 5 * np.cos(2*t) - 2 * np.cos(3*t) - np.cos(4*t)

plt.plot(x, y, color='red', linewidth=2)
plt.axis('equal')
plt.show()
