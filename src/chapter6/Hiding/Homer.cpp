// Homer.cpp: implementation of the Homer class.
//
//////////////////////////////////////////////////////////////////////

#include "Homer.h"
#include "iostream.h"

//////////////////////////////////////////////////////////////////////
// Construction/Destruction
//////////////////////////////////////////////////////////////////////

Homer::Homer()
{

}

Homer::~Homer()
{

}

char Homer::doh(char c)
{
	cout<<"doh(char)\n";
	return 'd';
}

float Homer::doh(float f)
{
	cout<<"doh(float)\n";
	return 1.0f;
}

void Bart::doh(Milhouse& m)
{
	cout<<"doh(Milhouse)\n";
}

void main(){
	Bart b;
	Milhouse m;
	b.doh(m);
	//b.doh('c');
	//b.doh(1.0f);
}