import numpy as np

res = np.random.uniform(1,1458,10000000)
print(int(res[2845000]))


# import pandas as pd
#
# chunk_names = []
# chunk_data = pd.read_csv("Random1M.txt", chunksize=1000)
#
# for chunk in chunk_data:
#     chunk.columns = ['Numbers']
#     sorted_chunk = chunk.sort_values('Numbers', axis=0, ascending=True,
#                                      inplace=True, na_position='last')
#
#     chunk_name = 'chunk_{}.chk'.format(chunk)
#     chunk_names.append(chunk_name)
#     with open(chunk_name, 'w') as chunk_file:
#         chunk_file.writelines(sorted_chunk)
#
# with ExitStack() as stack, open('output23.txt', 'w') as output_file:
#     files = [stack.enter_context(open(chunk)) for chunk in chunk_names]
#     output_file.writelines(merge(*files))
#
#
#
# with open("output23.txt") as fp:
#     for i, row in enumerate(fp):
#         if i == 2845001:
#             print(row)
#             break