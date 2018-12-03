package com.hospital.registration;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * RegistrationDataSourceConfig.
 * 
 * @author
 *
 */
@Configuration
@MapperScan(basePackages = "com.hospital.registration.dao", sqlSessionTemplateRef = "registrationSqlSessionTemplate")
public class RegistrationDataSourceConfig {
    /**
     * registrationDataSource.
     * 
     * @return DataSource
     */
    @Bean(name = "registrationDataSource")
    @ConfigurationProperties(prefix = "app.datasource.registration")
    @Primary
    public DataSource registrationDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * registrationSqlSessionFactory.
     * 
     * @param: dataSource
     * @return: SqlSessionFactory
     */
    @Bean(name = "registrationSqlSessionFactory")
    @Primary
    public SqlSessionFactory registrationSqlSessionFactory(@Qualifier("registrationDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:com/hospital/registration/dao/*.xml"));
        return bean.getObject();
    }

    /**
     * registrationTransactionManager.
     * 
     * @param dataSource
     *            dataSource
     * @return DataSourceTransactionManager
     */
    @Bean(name = "registrationTransactionManager")
    @Primary
    public DataSourceTransactionManager registrationTransactionManager(
            @Qualifier("registrationDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * registrationSqlSessionTemplate.
     * 
     * @param: sqlSessionFactory
     * @return: SqlSessionTemplate
     */
    @Bean(name = "groundSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate registrationSqlSessionTemplate(
            @Qualifier("registrationSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
