/*
 * Copyright (c) 2011-2021, baomidou (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.generator.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.config.builder.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;


/**
 * 全局配置
 *
 * @author hubin
 * @since 2016-12-02
 */
public class GlobalConfig {

    /**
     * 生成文件的输出目录【 windows:D://  linux or mac:/tmp 】
     */
    private String outputDir = System.getProperty("os.name").toLowerCase().contains("windows") ? "D://" : "/tmp";

    /**
     * 是否覆盖已有文件
     */
    private boolean fileOverride = false;

    /**
     * 是否打开输出目录
     */
    private boolean open = true;

    /**
     * 是否在xml中添加二级缓存配置
     */
    @Deprecated
    private boolean enableCache = false;

    /**
     * 开发人员
     */
    private String author;

    /**
     * 开启 Kotlin 模式
     */
    private boolean kotlin = false;

    /**
     * 开启 swagger2 模式
     */
    private boolean swagger2 = false;

    /**
     * 开启 ActiveRecord 模式
     */
    @Deprecated
    private boolean activeRecord = false;

    /**
     * 开启 BaseResultMap
     */
    @Deprecated
    private boolean baseResultMap = false;

    /**
     * 时间类型对应策略
     */
    private DateType dateType = DateType.TIME_PACK;

    /**
     * 开启 baseColumnList
     */
    @Deprecated
    private boolean baseColumnList = false;
    /**
     * 各层文件名称方式，例如： %sAction 生成 UserAction
     * %s 为占位符
     */
    @Deprecated
    private String entityName;
    @Deprecated
    private String mapperName;
    @Deprecated
    private String xmlName;
    @Deprecated
    private String serviceName;
    @Deprecated
    private String serviceImplName;
    @Deprecated
    private String controllerName;

    /**
     * 获取注释日期
     *
     * @since 3.5.0
     */
    private Supplier<String> commentDate = () -> new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    private GlobalConfig() {
        // 不推荐使用
    }

    /**
     * 指定生成的主键的ID类型
     */
    @Deprecated
    private IdType idType;

    /**
     * 是否开启 ActiveRecord 模式
     *
     * @return 是否开启
     * @see Entity#isActiveRecord()
     * @deprecated 3.5.0
     */
    public boolean isActiveRecord() {
        return activeRecord;
    }

    /**
     * 开启 ActiveRecord 模式
     *
     * @param activeRecord 是否开启
     * @return this
     * @see com.baomidou.mybatisplus.generator.config.builder.Entity.Builder#activeRecord(boolean)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setActiveRecord(boolean activeRecord) {
        this.activeRecord = activeRecord;
        return this;
    }

    /**
     * @return this
     * @see Entity#getIdType()
     * @deprecated 3.5.0
     */
    @Deprecated
    public IdType getIdType() {
        return idType;
    }

    /**
     * 指定生成的主键的ID类型
     *
     * @param idType 主键类型
     * @return this
     * @see Entity.Builder#idType(IdType)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setIdType(@NotNull IdType idType) {
        this.idType = idType;
        return this;
    }

    /**
     * @return 是否开启
     * @see Mapper#isBaseResultMap() a
     * @deprecated 3.5.0
     */
    @Deprecated
    public boolean isBaseResultMap() {
        return baseResultMap;
    }

    /**
     * @param baseResultMap 是否开启
     * @return this
     * @see Mapper.Builder#baseResultMap(boolean)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setBaseResultMap(boolean baseResultMap) {
        this.baseResultMap = baseResultMap;
        return this;
    }

    /**
     * @return 是否开启
     * @see Mapper#isBaseColumnList()
     * @deprecated 3.5.0
     */
    @Deprecated
    public boolean isBaseColumnList() {
        return baseColumnList;
    }

    /**
     * @param baseColumnList 是否开启
     * @return this
     * @see Mapper.Builder#baseColumnList(boolean)
     */
    @Deprecated
    public GlobalConfig setBaseColumnList(boolean baseColumnList) {
        this.baseColumnList = baseColumnList;
        return this;
    }

    /**
     * @return 是否开启
     * @see Mapper#isEnableXmlCache()
     * @deprecated 3.5.0
     */
    @Deprecated
    public boolean isEnableCache() {
        return enableCache;
    }

    /**
     * @param enableCache 是否开启
     * @return this
     * @see Mapper.Builder#enableXmlCache(boolean)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
        return this;
    }

    /**
     * @param entityName
     * @return this
     * @see Entity.Builder#formatFileName(String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setEntityName(@NotNull String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * @param mapperName
     * @return this
     * @see Mapper.Builder#formatMapperFileName(String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setMapperName(@NotNull String mapperName) {
        this.mapperName = mapperName;
        return this;
    }

    /**
     * @param xmlName
     * @return this
     * @see Mapper.Builder#formatXmlFileName(String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setXmlName(@NotNull String xmlName) {
        this.xmlName = xmlName;
        return this;
    }

    /**
     * @param serviceName
     * @return this
     * @see Service.Builder#formatServiceFileName(String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setServiceName(@NotNull String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * @param serviceImplName
     * @return this
     * @see Service.Builder#formatServiceFileName(String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setServiceImplName(@NotNull String serviceImplName) {
        this.serviceImplName = serviceImplName;
        return this;
    }

    /**
     * @param controllerName
     * @return this
     * @see Controller.Builder#formatFileName(java.lang.String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setControllerName(@NotNull String controllerName) {
        this.controllerName = controllerName;
        return this;
    }

    /**
     * @param dateType
     * @return this
     * @see Builder#dateType(DateType)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setDateType(@NotNull DateType dateType) {
        this.dateType = dateType;
        return this;
    }

    /**
     * @param outputDir
     * @return this
     * @see Builder#outputDir(String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setOutputDir(@NotNull String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * @param fileOverride
     * @return this
     * @see Builder#fileOverride(boolean)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setFileOverride(boolean fileOverride) {
        this.fileOverride = fileOverride;
        return this;
    }

    /**
     * @param open
     * @return this
     * @see Builder#openDir(boolean)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setOpen(boolean open) {
        this.open = open;
        return this;
    }

    /**
     * @param author
     * @return this
     * @see Builder#author(String)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setAuthor(@NotNull String author) {
        this.author = author;
        return this;
    }

    /**
     * @param kotlin
     * @return this
     * @see Builder#kotlin(boolean)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setKotlin(boolean kotlin) {
        this.kotlin = kotlin;
        return this;
    }

    /**
     * @param swagger2
     * @return this
     * @see Builder#swagger2(boolean)
     * @deprecated 3.5.0
     */
    @Deprecated
    public GlobalConfig setSwagger2(boolean swagger2) {
        this.swagger2 = swagger2;
        return this;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public boolean isFileOverride() {
        return fileOverride;
    }

    public boolean isOpen() {
        return open;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isKotlin() {
        return kotlin;
    }

    public boolean isSwagger2() {
        return swagger2;
    }

    @NotNull
    public DateType getDateType() {
        return dateType;
    }

    @Deprecated
    public String getEntityName() {
        return entityName;
    }

    @Deprecated
    public String getMapperName() {
        return mapperName;
    }

    @Deprecated
    public String getXmlName() {
        return xmlName;
    }

    @Deprecated
    public String getServiceName() {
        return serviceName;
    }

    @Deprecated
    public String getServiceImplName() {
        return serviceImplName;
    }

    @Deprecated
    public String getControllerName() {
        return controllerName;
    }

    @NotNull
    public String getCommentDate() {
        return commentDate.get();
    }

    /**
     * 全局配置构建
     *
     * @author nieqiurong 2020/10/11.
     * @since 3.5.0
     */
    public static class Builder implements IConfigBuilder<GlobalConfig> {

        private final GlobalConfig globalConfig;

        public Builder() {
            this.globalConfig = new GlobalConfig();
        }

        /**
         * 开启 ActiveRecord 模式
         *
         * @param activeRecord 是否开启
         * @return this
         * @see com.baomidou.mybatisplus.generator.config.builder.Entity.Builder#activeRecord(boolean)
         * @deprecated 3.5.0
         */
        @Deprecated
        public Builder activeRecord(boolean activeRecord) {
            this.globalConfig.activeRecord = activeRecord;
            return this;
        }

        /**
         * 指定生成的主键的ID类型
         *
         * @param idType 主键类型
         * @return this
         * @see Entity.Builder#idType(IdType)
         * @deprecated 3.5.0
         */
        @Deprecated
        public Builder idType(@NotNull IdType idType) {
            this.globalConfig.idType = idType;
            return this;
        }

        /**
         * 开启baseResultMap
         *
         * @param baseResultMap 是否开启
         * @return this
         * @see Mapper.Builder#baseResultMap(boolean)
         * @deprecated 3.5.0
         */
        @Deprecated
        public Builder baseResultMap(boolean baseResultMap) {
            this.globalConfig.baseResultMap = baseResultMap;
            return this;
        }

        /**
         * 开启baseColumnList
         *
         * @param baseColumnList 是否开启
         * @return this
         * @see Mapper.Builder#baseColumnList(boolean)
         * @deprecated 3.5.0
         */
        @Deprecated
        public Builder baseColumnList(boolean baseColumnList) {
            this.globalConfig.baseColumnList = baseColumnList;
            return this;
        }

        /**
         * xml中添加二级缓存配置
         *
         * @param enableCache 是否开启
         * @return this
         * @see Mapper.Builder#enableXmlCache(boolean)
         * @deprecated 3.5.0
         */
        @Deprecated
        public Builder enableCache(boolean enableCache) {
            this.globalConfig.enableCache = enableCache;
            return this;
        }

        public Builder fileOverride(boolean fileOverride) {
            this.globalConfig.fileOverride = fileOverride;
            return this;
        }

        public Builder openDir(boolean open) {
            this.globalConfig.open = open;
            return this;
        }

        public Builder outputDir(@NotNull String outputDir) {
            this.globalConfig.outputDir = outputDir;
            return this;
        }

        public Builder author(@NotNull String author) {
            this.globalConfig.author = author;
            return this;
        }

        public Builder kotlin(boolean kotlin) {
            this.globalConfig.kotlin = kotlin;
            return this;
        }

        public Builder swagger2(boolean swagger2) {
            this.globalConfig.swagger2 = swagger2;
            return this;
        }

        @Deprecated
        public Builder entityName(@NotNull String entityName) {
            this.globalConfig.entityName = entityName;
            return this;
        }

        @Deprecated
        public Builder xmlName(@NotNull String xmlName) {
            this.globalConfig.xmlName = xmlName;
            return this;
        }

        @Deprecated
        public Builder serviceName(@NotNull String serviceName) {
            this.globalConfig.serviceName = serviceName;
            return this;
        }

        @Deprecated
        public Builder serviceImplName(@NotNull String serviceImplName) {
            this.globalConfig.serviceImplName = serviceImplName;
            return this;
        }

        @Deprecated
        public Builder controllerName(@NotNull String controllerName) {
            this.globalConfig.controllerName = controllerName;
            return this;
        }

        @Deprecated
        public Builder mapperName(@NotNull String mapperName) {
            this.globalConfig.mapperName = mapperName;
            return this;
        }

        public Builder dateType(@NotNull DateType dateType) {
            this.globalConfig.dateType = dateType;
            return this;
        }

        /**
         * 注释日志获取处理
         * example: () -> LocalDateTime.now().format(DateTimeFormatter.ISO_DATE)
         *
         * @param commentDate 获取注释日期
         * @return this
         * @since 3.5.0
         */
        public Builder commentDate(@NotNull Supplier<String> commentDate) {
            this.globalConfig.commentDate = commentDate;
            return this;
        }

        /**
         * 指定注释日期格式化
         *
         * @param pattern 格式
         * @return this
         * @since 3.5.0
         */
        public Builder commentDate(@NotNull String pattern) {
            return commentDate(() -> new SimpleDateFormat(pattern).format(new Date()));
        }

        @Override
        public GlobalConfig build() {
            return this.globalConfig;
        }
    }
}
