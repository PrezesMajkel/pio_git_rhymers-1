package edu.kis.vh.nursery;


public class DefaultCountingOutRhymer
{

    public static final int MAX_AMOUNT_OF_ELEMENTS = 12;
    public int EMPTY = -1;
    private int[] NUMBERS = new int[MAX_AMOUNT_OF_ELEMENTS];

    public void countIn(int in)
    {
        if (!isFull())
            NUMBERS[++EMPTY] = in;
    }

    public boolean callCheck()
    {
        return EMPTY == -1;
    }

    public boolean isFull()
    {
        return EMPTY == 11;
    }

    protected int peekaboo()
    {
        if (callCheck())
            return -1;
        return NUMBERS[EMPTY];
    }

    public int countOut()
    {
        if (callCheck())
            return -1;
        return NUMBERS[EMPTY--];
    }

}
