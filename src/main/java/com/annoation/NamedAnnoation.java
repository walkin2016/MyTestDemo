package com.annoation;

import java.lang.annotation.Annotation;
import java.util.Objects;

public class NamedAnnoation implements Named{
    final String value;

    public NamedAnnoation(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return Named.class;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NamedAnnoation that = (NamedAnnoation) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "NamedAnnoation{" +
                "value='" + value + '\'' +
                '}';
    }
}
