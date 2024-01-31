from tokenize import String
import pandas as pd
text = 'Thailand is a middle power in global affairs and a founding member of ASEAN, and ranks high in the Human Development Index.'
c = text.count('')
print( text, c , "chars")
print(pd.Series(list(text)).value_counts())