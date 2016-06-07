package logging;

import java.lang.reflect.Method;

/**
 * Created by dshynkarenko on 6/6/2016.
 */
public interface ITestObjectExceptionHandler {

    public Object handleException(Object object, Method originalMethod, Object[] args, Throwable t) throws Throwable;

}
