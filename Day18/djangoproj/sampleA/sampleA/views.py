from django.http import HttpResponse
from django.shortcuts import render

def home(requests):
#	return HttpResponse('<h1>Hello World!</h1>')
		return render(requests,'home.html',{'city':'Hyderabad','company':'Deloitte.'})

def niit(requests):
	return HttpResponse('NIIT 4A')

def count(request):
	data = request.GET['fulltext']
	listx=data.split()
	dictx = {}
	for word in listx:
		if word in dictx:
			dictx[word]=dictx[word]+1
		else:
			dictx[word]=1

	return render(request,'count.html',{'dataone':data,'len':len(listx),'eachword':dictx.items()})
