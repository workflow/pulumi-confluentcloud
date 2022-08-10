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
// `RoleBinding` describes a Role Binding.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleRoleBinding, err := confluentcloud.LookupRoleBinding(ctx, &GetRoleBindingArgs{
// 			Id: "rb-abc123",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("example", exampleRoleBinding)
// 		return nil
// 	})
// }
// ```
func LookupRoleBinding(ctx *pulumi.Context, args *LookupRoleBindingArgs, opts ...pulumi.InvokeOption) (*LookupRoleBindingResult, error) {
	var rv LookupRoleBindingResult
	err := ctx.Invoke("confluentcloud:index/getRoleBinding:getRoleBinding", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRoleBinding.
type LookupRoleBindingArgs struct {
	// The ID of the Role Binding (for example, `rb-abc123`).
	Id string `pulumi:"id"`
}

// A collection of values returned by getRoleBinding.
type LookupRoleBindingResult struct {
	// (Required String) A [Confluent Resource Name(CRN)](<https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)>) that specifies the scope and resource patterns necessary for the role to bind.
	CrnPattern string `pulumi:"crnPattern"`
	Id         string `pulumi:"id"`
	// (Required String) A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
	Principal string `pulumi:"principal"`
	// (Required String) A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
	RoleName string `pulumi:"roleName"`
}

func LookupRoleBindingOutput(ctx *pulumi.Context, args LookupRoleBindingOutputArgs, opts ...pulumi.InvokeOption) LookupRoleBindingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRoleBindingResult, error) {
			args := v.(LookupRoleBindingArgs)
			r, err := LookupRoleBinding(ctx, &args, opts...)
			var s LookupRoleBindingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRoleBindingResultOutput)
}

// A collection of arguments for invoking getRoleBinding.
type LookupRoleBindingOutputArgs struct {
	// The ID of the Role Binding (for example, `rb-abc123`).
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupRoleBindingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleBindingArgs)(nil)).Elem()
}

// A collection of values returned by getRoleBinding.
type LookupRoleBindingResultOutput struct{ *pulumi.OutputState }

func (LookupRoleBindingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleBindingResult)(nil)).Elem()
}

func (o LookupRoleBindingResultOutput) ToLookupRoleBindingResultOutput() LookupRoleBindingResultOutput {
	return o
}

func (o LookupRoleBindingResultOutput) ToLookupRoleBindingResultOutputWithContext(ctx context.Context) LookupRoleBindingResultOutput {
	return o
}

// (Required String) A [Confluent Resource Name(CRN)](<https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)>) that specifies the scope and resource patterns necessary for the role to bind.
func (o LookupRoleBindingResultOutput) CrnPattern() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleBindingResult) string { return v.CrnPattern }).(pulumi.StringOutput)
}

func (o LookupRoleBindingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleBindingResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
func (o LookupRoleBindingResultOutput) Principal() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleBindingResult) string { return v.Principal }).(pulumi.StringOutput)
}

// (Required String) A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
func (o LookupRoleBindingResultOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleBindingResult) string { return v.RoleName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRoleBindingResultOutput{})
}