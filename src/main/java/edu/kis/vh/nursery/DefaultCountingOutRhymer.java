package edu.kis.vh.nursery;


public class DefaultCountingOutRhymer
{

    public static final int MAX_AMOUNT_OF_ELEMENTS = 12;
    public static final int MAX_INDEX = MAX_AMOUNT_OF_ELEMENTS - 1;
    public final int EMPTY = -1;
    public int amount_elements = -1;
    private int[] numbers = new int[MAX_AMOUNT_OF_ELEMENTS];

    public void countIn(int in)
    {
        if (!isFull())
            numbers[++amount_elements] = in;
    }

    public boolean callCheck()
    {
        return amount_elements == EMPTY;
    }

    public boolean isFull()
    {
        return amount_elements == MAX_INDEX;
    }

    protected int peekaboo()
    {
        if (callCheck())
            return EMPTY;
        return numbers[amount_elements];
    }

    public int countOut()
    {
        if (callCheck())
            return EMPTY;
        return numbers[amount_elements--];
    }

    public int getTotal()
    {
        return amount_elements;
    }

    public int setTotal(int total)
    {
        this.amount_elements = total;
        return this.amount_elements;
    }
}
