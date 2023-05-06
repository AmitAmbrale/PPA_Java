class Multi3
{
    public static void main(String Arg[])
    {
        Thread t=Thread.currentThread();

        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}