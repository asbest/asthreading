"""
force multi threading by remotely instancing a py script
call this script with python -i to keep the processes alive
"""

__author__ = "Andreas S."

import sys
from subprocess import Popen, PIPE, STDOUT


processes = []

try:
    pythonPath = sys.executable
except:
    pythonPath = None

def runInNewThread(command, usePythonPath=False):
	"""
	runs a command in a new process i.e. 'python script.py' and returns processes index
	if usePythonPath: append command to pythonPath
	"""
	if usePythonPath: processes.append( Popen( pythonPath + " " + command , stdout=PIPE) )
	else: processes.append( Popen( command , stdout=PIPE) )
	return len(processes) - 1


def killAllProcesses():
    """ kill all processes """
    for p in processes:
        p.kill()



# --------------------------------------------------------
