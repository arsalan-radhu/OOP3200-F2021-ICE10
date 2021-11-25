/*
 * Name: Arsalan Arif Radhu
 * Student ID: 100813965
 * Date: 25 November 2021
 * Description: ICE 10 for OOP3200
 */

package ca.durhamcollege;

import java.util.Random;

// singleton
public class RandomVector
{
    private Random m_rand;

    private static RandomVector m_instance = null;

    private RandomVector()
    {
        m_rand = new Random();
    }

    public static RandomVector Instance()
    {
        if(m_instance == null)
        {
            m_instance = new RandomVector();
        }
        return m_instance;
    }

    public final Vector2D createVector2D(final Vector2D start, final Vector2D end)
    {
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());

        float randomX = (m_rand.nextFloat() * (maxX - minX)) + minX;

        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());

        float randomY = (m_rand.nextFloat() * (maxY - minY)) + minY;

        return new Vector2D(randomX, randomY);
    }
}