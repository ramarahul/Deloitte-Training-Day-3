# IPython log file

lista=[]
for var in "sankranthi":
lista=[]
for var in "sankranthi":
    lista.append(var)
lista
#[Out]# ['s', 'a', 'n', 'k', 'r', 'a', 'n', 't', 'h', 'i']
listb = [var for var in 'sankranthi']
listb
#[Out]# ['s', 'a', 'n', 'k', 'r', 'a', 'n', 't', 'h', 'i']
#list comprehensions
num_list = [x for x in range(17) if x%2==0]
num_list
#[Out]# [0, 2, 4, 6, 8, 10, 12, 14, 16]
list_a = [1,2,3,4]
list_b=  [3,4,5,6]
num = []
for x in list_a:
    for y in list_b:
        if x == y:
            num.append(x)
num
#[Out]# [3, 4]
list_a = [1,2,3,4]
list_b=  [3,4,5,6]
num = []
num = [x for x in lista_a for y in list_b if x==y]
num = [x for x in list_a for y in list_b if x==y]
num
#[Out]# [3, 4]
for x in "qwerty" print(x)
for x in "qwerty": print(x)
get_ipython().run_line_magic('history', '-f h.py')
get_ipython().run_line_magic('save', 'filename 40-50')
get_ipython().run_line_magic('lsmagic', '')
#[Out]# Available line magics:
#[Out]# %alias  %alias_magic  %autoawait  %autocall  %automagic  %autosave  %bookmark  %cd  %clear  %cls  %colors  %conda  %config  %connect_info  %copy  %ddir  %debug  %dhist  %dirs  %doctest_mode  %echo  %ed  %edit  %env  %gui  %hist  %history  %killbgscripts  %ldir  %less  %load  %load_ext  %loadpy  %logoff  %logon  %logstart  %logstate  %logstop  %ls  %lsmagic  %macro  %magic  %matplotlib  %mkdir  %more  %notebook  %page  %pastebin  %pdb  %pdef  %pdoc  %pfile  %pinfo  %pinfo2  %pip  %popd  %pprint  %precision  %prun  %psearch  %psource  %pushd  %pwd  %pycat  %pylab  %qtconsole  %quickref  %recall  %rehashx  %reload_ext  %ren  %rep  %rerun  %reset  %reset_selective  %rmdir  %run  %save  %sc  %set_env  %store  %sx  %system  %tb  %time  %timeit  %unalias  %unload_ext  %who  %who_ls  %whos  %xdel  %xmode
#[Out]# 
#[Out]# Available cell magics:
#[Out]# %%!  %%HTML  %%SVG  %%bash  %%capture  %%cmd  %%debug  %%file  %%html  %%javascript  %%js  %%latex  %%markdown  %%perl  %%prun  %%pypy  %%python  %%python2  %%python3  %%ruby  %%script  %%sh  %%svg  %%sx  %%system  %%time  %%timeit  %%writefile
#[Out]# 
#[Out]# Automagic is ON, % prefix IS NOT needed for line magics.
get_ipython().run_line_magic('ldir', '')
get_ipython().run_line_magic('ls', '')
get_ipython().run_cell_magic('python2', '', 'print "hello"\n')
get_ipython().run_cell_magic('ruby', '', 'print "hello"\n')
get_ipython().run_line_magic('pinfo', '%ls')
numbers = [1,2,3,4]
squares = []
def sq(arr):
    res = []
    for i in arr:
        res.append(i**2)
    return res
def sql(arr):
    return [i**2 for i in arr]
get_ipython().run_line_magic('timeit', 'sq(range(1, 11))')
get_ipython().run_line_magic('timeit', 'sql(range(1, 11))')
