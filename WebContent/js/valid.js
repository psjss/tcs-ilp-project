function valide()
{
	var x=document.myform.stbid.value;
	
	if(x==null||x=="")
		{
			alert("STB id cannot be null");
			return false;
		
		}

	
	return true;
	
	}

function validity()
{
	
	var ck=document.form.billtype[0].checked;
	var c =document.form.billtype[1].checked;

		if (ck==false&&c==false) 
			{
			alert("please select bill type");
			return false;
			}
		var c1=document.form.stbtype[0].checked;
		var c2 =document.form.stbtype[1].checked;
		var c3=document.form.stbtype[2].checked;
		var c4 =document.form.stbtype[3].checked;
		if(c1==false&&c2==false&&c3==false&&c4==false)
			{
			alert("please select stb type");
			return false;
			}
}