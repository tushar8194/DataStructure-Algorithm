#!/usr/bin/env python
import os
import subprocess
from multiprocessing import Pool


def run(task):
  dest_dir = task[0].replace("/prod/","/prod_backup/")
  os.system("mkdir -p " + str(dest_dir))
  print("detination directory Available now " + str(dest_dir))

  sourceFile = str(task[0]) + "/" + str(task[1])
  print("Copying " + str(sourceFile) + " to " + str(dest_dir))
  subprocess.call(["rsync", "-arq", sourceFile, dest_dir])


def task_list(path):
  fname = []
  for root,d_names,f_names in os.walk(path):
    for f in f_names:
      fname.append((root, f))

  for f in fname:
    print(f)
  return fname



if __name__ == "__main__":
  tasks = task_list('~/data/prod')
  # Create a pool of specific number of CPUs
  p = Pool(len(tasks))
  # Start each task within the pool
  p.map(run, tasks)

