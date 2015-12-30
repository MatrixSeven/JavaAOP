package proxy.annon;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Seven {
	
	public String value() default "Ð¡ºÚ";
	
	public String Property() default "ÎÞÊôÐÔ";
	
}
