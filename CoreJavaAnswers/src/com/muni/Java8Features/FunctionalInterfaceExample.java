package com.muni.Java8Features;
@FunctionalInterface
interface Vehicle
{
    public void speed();
    default void sound()
    {
    }
    public static void capacity()
    {
    }
}
