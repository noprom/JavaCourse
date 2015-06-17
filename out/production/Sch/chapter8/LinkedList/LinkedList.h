// LinkedList.h: interface for the LinkedList class.
//
//////////////////////////////////////////////////////////////////////

#if !defined(AFX_LINKEDLIST_H__10A49C37_0453_4781_87D3_97585452C874__INCLUDED_)
#define AFX_LINKEDLIST_H__10A49C37_0453_4781_87D3_97585452C874__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

class LinkedList  
{
public:
	LinkedList();
	virtual ~LinkedList();

public:
	class Iterator // a nested class
	{
	public:
		int erase();
		void insert(int x);
	};

private:
	class Link // a nested class
	{
	public:
		int data;
		Link* next;
	};
};

#endif // !defined(AFX_LINKEDLIST_H__10A49C37_0453_4781_87D3_97585452C874__INCLUDED_)
