package com.example.compliance.definition;

import com.example.compliance.Control;
import com.example.compliance.definition.exception.DefinitionInvocationException;
import com.example.compliance.definition.exception.MethodHasArgumentsException;
import com.example.compliance.definition.exception.NoDefaultConstructorException;
import com.example.compliance.definition.exception.UndefinedControlException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class DefinitionLoader {


    private final Map<String, Method> methods = new HashMap<>();


    private DefinitionLoader(final Builder builder) {
        builder.classList.forEach(clazz -> loadClass(clazz));
    }

    private void loadClass(final Class clazz) {
        for (final Method method : clazz.getDeclaredMethods()) {
            final Control annotation = method.getAnnotation(Control.class);
            if (null != annotation) {
                if (method.getParameterCount() == 0) {
                    methods.put(annotation.name(), method);
                } else {
                    throw new MethodHasArgumentsException();
                }
            }
        }
    }

    public void invokeControl(final String controlName) {
        if (methods.containsKey(controlName)) {
            final Method method = methods.get(controlName);
            try {
                final Object instance = method.getDeclaringClass().getDeclaredConstructor(new Class[]{}).newInstance();
                method.invoke(instance);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new DefinitionInvocationException();
            }
        } else {
            throw new UndefinedControlException(controlName);
        }
    }

    public boolean hasControl(final String control) {
        return methods.containsKey(control);
    }


    public static class Builder {

        private Set<Class> classList = new HashSet<>();

        public Builder addClass(final Class clazz) {
            Objects.requireNonNull(clazz);
            try {
                clazz.getDeclaredConstructor(new Class[]{});
            } catch (NoSuchMethodException e) {
                throw new NoDefaultConstructorException();
            }
            classList.add(clazz);
            return this;
        }


        public DefinitionLoader build() {
            return new DefinitionLoader(this);
        }
    }

}
