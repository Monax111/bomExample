import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
open class ApplicationLight

fun main(args: Array<String>) {
    SpringApplicationBuilder(ApplicationLight::class.java)
        .run(*args)
}
