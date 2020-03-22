package com.zipcodewilmington.streams;

import com.zipcodewilmington.streams.anthropoid.Person;
import com.zipcodewilmington.streams.anthropoid.PersonFactory;
import com.zipcodewilmington.streams.tools.RandomUtils;
import com.zipcodewilmington.streams.tools.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 5/2/17.
 */
public class StreamFilter {
    private final Stream<Person> personStream;
    public final String startingCharacter;

    /**
     * No arg constructor
     */
    public StreamFilter()
    {
        this(Stream
                .generate(new PersonFactory()::createRandomPerson)
                .limit(100)
                .collect(Collectors.toList()),
                RandomUtils.createCharacter('A', 'Z'));
    }

    /**
     * @param people - Array of person objects
     * @param startingCharacter - character to filter by
     */
    public StreamFilter(Person[] people, Character startingCharacter)
    {
        this(Stream.of(people), startingCharacter);
    }

    /**
     * @param people - List of person objects
     * @param startingCharacter - character to filter by
     */
    public StreamFilter(List<Person> people, Character startingCharacter)
    {
        this(people.stream(), startingCharacter);
    }


    /**
     * @param people - Stream of person objects
     * @param startingCharacter - character to filter by
     */ // I took care of the easy constructor (͡° ͜ʖ ͡°)
    public StreamFilter(Stream<Person> people, Character startingCharacter)
    {
        this.personStream = people;
        this.startingCharacter = startingCharacter.toString();
    }


    /**
     * Using multi-line lambda syntax
     * @return a list of person object whose name starts with `this.startingCharacter`
     */ //TODO
    public List<Person> toListMultiLine()
    {
        return null;
    }


    /**
     * Using one-line lambda syntax
     * @return a list of person objects whose name starts with `this.startingCharacter`
     */ //TODO
    public List<Person> toListOneLine()
    {
        return null;
    }


    /**
     * Using one-line lambda syntax
     * @return an array of person object whose name starts with `this.startingCharacter`
     */ //TODO
    public Person[] toArrayOneLine()
    {
        return null;
    }


    /**
     * Using multi-line lambda syntax
     * @return an array of person object whose name starts with `this.startingCharacter`
     */ //TODO
    public Person[] toArrayMultiLine()
    {
        return null;
    }

}