package edu.kis.vh.nursery.list;

/**
 * Lista wiązana, dwukierunkowa, warości typu INT
 */
public class IntLinkedList
{

	private static final int MINUS = -1;
	private Node last;
	int i;

    /**
     *  Dodanie nowego elementu
     * @param i wartość nowego elementu
     */
	public void push(int i)
	{
		if (last == null)
			last = new Node(i);
		else
		{
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

    /**
     *  Sprawdzenie czy lista jest pusta
     * @return
     */
	private boolean isEmpty()
	{
		return last == null;
	}

    /**
     *  Sprawdzenie czy lista jest pełna
     * @return wartość logiczna FALSE, gdy lista nie jest pełna
     */
	public boolean isFull()
	{
		return false;
	}

    /**
     *  Wyłuskanie wartości ostatniego elementu listy
     * @return wartość ostatniego elementu listy, lub -1 jeżeli lista była pusta
     */
	public int top()
	{
		if (isEmpty())
			return MINUS;
		return last.value;
	}

    /**
     *  Zdjęcie ostatniego elementu listy; przedostatni element staje się ostatnim
     * @return wartość ostatniego elementu listy, lub -1 jeżeli lista była pusta
     */
	public int pop()
	{
		if (isEmpty())
			return MINUS;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
