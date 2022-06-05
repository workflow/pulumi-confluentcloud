# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetServiceAccountResult',
    'AwaitableGetServiceAccountResult',
    'get_service_account',
    'get_service_account_output',
]

@pulumi.output_type
class GetServiceAccountResult:
    """
    A collection of values returned by getServiceAccount.
    """
    def __init__(__self__, api_version=None, description=None, display_name=None, id=None, kind=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> str:
        """
        (Required String) An API Version of the schema version of the Service Account.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Required String) A free-form description of the Service Account.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) A human-readable name for the Service Account.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Service Account (e.g., `sa-abc123`).
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        (Required String) A kind of the Service Account.
        """
        return pulumi.get(self, "kind")


class AwaitableGetServiceAccountResult(GetServiceAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceAccountResult(
            api_version=self.api_version,
            description=self.description,
            display_name=self.display_name,
            id=self.id,
            kind=self.kind)


def get_service_account(display_name: Optional[str] = None,
                        id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceAccountResult:
    """
    `ServiceAccount` describes a Service Account data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_service_account = confluentcloud.get_service_account(id="sa-abc123")
    pulumi.export("exampleUsingId", example_using_id_service_account)
    example_using_name = confluentcloud.get_service_account(display_name="test_sa")
    test_env = confluentcloud.Environment("test-env", display_name=f"env_for_{example_using_id_service_account.display_name}")
    ```


    :param str display_name: A human-readable name for the Service Account.
    :param str id: The ID of the Service Account (e.g., `sa-abc123`).
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['id'] = id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getServiceAccount:getServiceAccount', __args__, opts=opts, typ=GetServiceAccountResult).value

    return AwaitableGetServiceAccountResult(
        api_version=__ret__.api_version,
        description=__ret__.description,
        display_name=__ret__.display_name,
        id=__ret__.id,
        kind=__ret__.kind)


@_utilities.lift_output_func(get_service_account)
def get_service_account_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                               id: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceAccountResult]:
    """
    `ServiceAccount` describes a Service Account data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_service_account = confluentcloud.get_service_account(id="sa-abc123")
    pulumi.export("exampleUsingId", example_using_id_service_account)
    example_using_name = confluentcloud.get_service_account(display_name="test_sa")
    test_env = confluentcloud.Environment("test-env", display_name=f"env_for_{example_using_id_service_account.display_name}")
    ```


    :param str display_name: A human-readable name for the Service Account.
    :param str id: The ID of the Service Account (e.g., `sa-abc123`).
    """
    ...
