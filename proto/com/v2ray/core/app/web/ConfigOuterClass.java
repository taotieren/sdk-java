// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/web/config.proto

package com.v2ray.core.app.web;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_web_FileServer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_web_FileServer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_web_FileServer_Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_web_FileServer_Entry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_web_Server_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_web_Server_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_web_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_web_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#v2ray.com/core/app/web/config.proto\022\022v" +
      "2ray.core.app.web\0320v2ray.com/core/common" +
      "/serial/typed_message.proto\"\212\001\n\nFileServ" +
      "er\0223\n\005entry\030\001 \003(\0132$.v2ray.core.app.web.F" +
      "ileServer.Entry\032G\n\005Entry\022\016\n\004File\030\001 \001(\tH\000" +
      "\022\023\n\tDirectory\030\002 \001(\tH\000\022\014\n\004path\030\003 \001(\tB\013\n\tF" +
      "ileOrDir\"R\n\006Server\022\016\n\006domain\030\001 \003(\t\0228\n\010se" +
      "ttings\030\002 \001(\0132&.v2ray.core.common.serial." +
      "TypedMessage\"4\n\006Config\022*\n\006server\030\001 \003(\0132\032" +
      ".v2ray.core.app.web.ServerB4\n\026com.v2ray.",
      "core.app.webP\001Z\003web\252\002\022V2Ray.Core.App.Web" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor(),
        }, assigner);
    internal_static_v2ray_core_app_web_FileServer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_app_web_FileServer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_web_FileServer_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_v2ray_core_app_web_FileServer_Entry_descriptor =
      internal_static_v2ray_core_app_web_FileServer_descriptor.getNestedTypes().get(0);
    internal_static_v2ray_core_app_web_FileServer_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_web_FileServer_Entry_descriptor,
        new java.lang.String[] { "File", "Directory", "Path", "FileOrDir", });
    internal_static_v2ray_core_app_web_Server_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_app_web_Server_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_web_Server_descriptor,
        new java.lang.String[] { "Domain", "Settings", });
    internal_static_v2ray_core_app_web_Config_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_app_web_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_web_Config_descriptor,
        new java.lang.String[] { "Server", });
    com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
