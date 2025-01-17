// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// <img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt="">
//
// `Environment` describes an Environment data source.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleUsingIdEnvironment, err := confluentcloud.LookupEnvironment(ctx, &GetEnvironmentArgs{
//				Id: pulumi.StringRef("env-abc123"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingIdEnvironment)
//			exampleUsingNameEnvironment, err := confluentcloud.LookupEnvironment(ctx, &GetEnvironmentArgs{
//				DisplayName: pulumi.StringRef("stag"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleUsingNameServiceAccount, err := confluentcloud.LookupServiceAccount(ctx, &GetServiceAccountArgs{
//				DisplayName: pulumi.StringRef("test_sa"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewRoleBinding(ctx, "test-role-binding", &confluentcloud.RoleBindingArgs{
//				Principal:  pulumi.String(fmt.Sprintf("User:%v", exampleUsingNameServiceAccount.Id)),
//				RoleName:   pulumi.String("EnvironmentAdmin"),
//				CrnPattern: pulumi.String(exampleUsingNameEnvironment.ResourceName),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEnvironment(ctx *pulumi.Context, args *LookupEnvironmentArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentResult, error) {
	var rv LookupEnvironmentResult
	err := ctx.Invoke("confluentcloud:index/getEnvironment:getEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentArgs struct {
	// A human-readable name for the Environment.
	DisplayName *string `pulumi:"displayName"`
	// The ID of the Environment, for example, `env-abc123`.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResult struct {
	// (Required String) A human-readable name for the Environment.
	DisplayName string `pulumi:"displayName"`
	// (Required String) The ID of the Environment, for example, `env-abc123`.
	Id string `pulumi:"id"`
	// (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
	ResourceName string `pulumi:"resourceName"`
}

func LookupEnvironmentOutput(ctx *pulumi.Context, args LookupEnvironmentOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentResult, error) {
			args := v.(LookupEnvironmentArgs)
			r, err := LookupEnvironment(ctx, &args, opts...)
			var s LookupEnvironmentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEnvironmentResultOutput)
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentOutputArgs struct {
	// A human-readable name for the Environment.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// The ID of the Environment, for example, `env-abc123`.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentResult)(nil)).Elem()
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutput() LookupEnvironmentResultOutput {
	return o
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutputWithContext(ctx context.Context) LookupEnvironmentResultOutput {
	return o
}

// (Required String) A human-readable name for the Environment.
func (o LookupEnvironmentResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required String) The ID of the Environment, for example, `env-abc123`.
func (o LookupEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
func (o LookupEnvironmentResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentResultOutput{})
}
