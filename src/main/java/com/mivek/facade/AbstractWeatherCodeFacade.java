package com.mivek.facade;

import com.mivek.model.AbstractWeatherCode;
import com.mivek.parser.AbstractParser;

/**
 * Abstract facade.
 * @author mivek
 * Abstract class for facade.
 * @param <T> a concrete sub-class of {@link AbstractWeatherCode}.
 */
public abstract class AbstractWeatherCodeFacade<T extends AbstractWeatherCode> implements IWeatherCodeFacade<T> {
    /**
     * Const for icao length.
     */
    public static final int ICAO = 4;

    /**
     * The parser.
     */
    private AbstractParser<T> fParser;

    /**
     * Protected constructor to be used by sub-classes.
     * @param pParser the parser to set.
     */
    protected AbstractWeatherCodeFacade(final AbstractParser<T> pParser) {
        fParser = pParser;
    }

    /**
     * @return the parser.
     */
    protected AbstractParser<T> getParser() {
        return fParser;
    }

}
