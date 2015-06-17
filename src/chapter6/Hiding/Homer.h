// Homer.h: interface for the Homer class.
//
//////////////////////////////////////////////////////////////////////

#if !defined(AFX_HOMER_H__DC5D3BB3_04CA_4A28_A5F1_3108EE8764E4__INCLUDED_)
#define AFX_HOMER_H__DC5D3BB3_04CA_4A28_A5F1_3108EE8764E4__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

class Homer  
{
public:
	float doh(float f);
	char doh(char c);
	Homer();
	virtual ~Homer();


};

class Milhouse{};

class Bart:public Homer
{
public:
	void doh(Milhouse& m);
};

#endif // !defined(AFX_HOMER_H__DC5D3BB3_04CA_4A28_A5F1_3108EE8764E4__INCLUDED_)
