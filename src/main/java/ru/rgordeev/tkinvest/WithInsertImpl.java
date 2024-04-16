package ru.rgordeev.tkinvest;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;

public class WithInsertImpl<T> implements WithInsert<T> {

    private final JdbcAggregateTemplate template;

    public WithInsertImpl(JdbcAggregateTemplate template) {
        this.template = template;
    }

    @Override
    public T insert(T t) {
        return template.insert(t);
    }
}
