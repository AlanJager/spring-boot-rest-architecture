package zyan.common.ratelimit;

import java.lang.annotation.*;

/**
 * Created by zouye on 2016/10/27.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimit {
    /**
     * @return rate limit in queries per second
     */
    int value();

    /**
     * @return rate limiter identifier (optional)
     */
    String key() default "";
}