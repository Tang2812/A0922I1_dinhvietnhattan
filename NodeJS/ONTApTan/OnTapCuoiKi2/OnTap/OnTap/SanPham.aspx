<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="SanPham.aspx.cs" Inherits="OnTap.SanPham" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <h2>Thong tin san pham</h2>
    <asp:DataList ID="DataList1" runat="server" >
        <ItemTemplate>
            <asp:Image ID="Image1" runat="server" ImageUrl='<%# "images/"+Eval("Hinh") %>' />
            <br />
         
            <asp:Label ID="Label2" runat="server" Text='<%# Eval("TenHoa") %>'></asp:Label>
               <br />
               <asp:Label ID="Label1" runat="server" Text='<%# Eval("DonGia") %>'></asp:Label>
         
            <br />
          <asp:LinkButton ID="LinkButton2" runat="server" CommandArgument='<%# Eval("MaHoa") %>' OnClick="LinkButton2_Click" Text='<%# "Thong tin san pham" %>'></asp:LinkButton>
         
        </ItemTemplate>
    </asp:DataList>
</asp:Content>
